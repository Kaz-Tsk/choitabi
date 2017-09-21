package com.internousdev.choitabi.dao;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.regex.Pattern;

import com.internousdev.choitabi.dto.KanriContactDTO;
import com.internousdev.choitabi.util.MongoDBConnector;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

/**
 * お問い合わせ取得に関するクラス
 * @author kanako miyazono
 * @since 2017/9/6
 * @version 1.1
 */
public class KanriContactDAO {

 ArrayList<KanriContactDTO> searchList = new ArrayList<KanriContactDTO>();


		 public ArrayList<KanriContactDTO> display(String searchName) {
		        MongoDBConnector con = new MongoDBConnector();
		        DB db=null;

		        try {
		        	db = con.getConnection();
		         } catch (UnknownHostException e) {
		        	 e.printStackTrace();
		         }

		        DBCollection coll = db.getCollection("collection");
		        DBCursor cursor=null;

		        //名前検索用
		        BasicDBObject queryname = new BasicDBObject("contact_name",Pattern.compile(Pattern.quote(searchName)));

		        if(searchName.length()==0){
		            //全件検索
		        	cursor = coll.find();
		        }else if(searchName.length()!=0){
		            //名前でのみ検索
		        	cursor = coll.find(queryname);
		        }

		        ArrayList<KanriContactDTO> searchList = new ArrayList<KanriContactDTO>();

				try {
					while (cursor.hasNext()) {
						KanriContactDTO dto = new KanriContactDTO();
		                DBObject dbs = cursor.next();
		                dto.setContact_name((String) dbs.get("contact_name"));
		                dto.setContact_mailAddress((String) dbs.get("contact_mailAddress"));
		                dto.setContact_contents((String) dbs.get("contact_contents"));

		               searchList.add(dto);
					}
				} finally {
		               cursor.close();
		       }

		         return searchList;
		    }
	}
