package com.internousdev.choitabi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.choitabi.dto.TourDTO;
import com.internousdev.choitabi.util.ChoitabiDBConnector;

/**
 * 商品一覧画面遷移に関するメソッド
 * @author SHUN NAGAO
 * @since 2017/09/13
 * @version 1.1
 */

public class TourListDAO {

    ArrayList<TourDTO> selectList=new ArrayList<TourDTO>();

    public ArrayList<TourDTO> display(String theme, String region) throws IllegalAccessException, InstantiationException{


    	/*テーマで検索されるとエリアが、エリアが入力されるとテーマが未入力のままアクションが動いてしまうので、空白を入れておきます*/
    	if(theme == null){
    		theme = "";
    	}

    	if(region == null){
    		region = "";
    	}


        try{

        	/*↓SQLへの接続を行っています*/
        	ChoitabiDBConnector db = new ChoitabiDBConnector();
            Connection con=db.createConnection();

            /*実行してもらうSQL分の、すでに決まっている部分を先に書いておきます*/
            /*テーマとエリアの部分だけは、お客さんが何を選ぶかによって変わるので、もう少しあとで決まります。*/
            /*（？の部分は、空欄、とイメージしてもらえるとわかりやすいかも）*/
            String sql = "select tour_id,tour_name,price,img from tour where theme like ? and region like ?";
            /*動作確認*/System.out.println("TourListDAO - 作成sql文 : " + sql);

            /*↓psさんに、上で書いたSQL文をあげておつかいを頼むイメージです*/
            PreparedStatement ps= con.prepareStatement(sql);

            /*ここで初めて、お客さんが選んだ（＝入力した）テーマとエリアの内容を、psの持っているSQL文に書き足します*/
            ps.setString(1, "%" + theme + "%");
            ps.setString(2, "%" + region + "%");

            /*psに、DBの中におつかいに行ってもらい、rsという入れ物に中身を入れて届けてもらうイメージです。*/
            ResultSet rs=ps.executeQuery();

            while (rs.next()) {
                TourDTO dto= new TourDTO();
                dto.setTour_id(rs.getInt("tour_id"));
                dto.setTour_name(rs.getString("tour_name"));
                dto.setPrice(rs.getBigDecimal("price"));
                dto.setImg(rs.getString("img"));
                /*動作確認*/System.out.println("TourListDAO-取得ツアー名：" + dto.getTour_name());
                selectList.add(dto);
                }

            rs.close();
            ps.close();
            con.close();


            /*↓ここから下の「catch」の部分は、（）の中に指定した例外（エラー）が出たときに、どのような対処を行わせるかが書かれています*/
        	}catch (SQLException e){
        	/*動作確認*/System.out.println("TourListDAO : SQL上でエラーが発生しました");
            e.printStackTrace();//←コンソールに並ぶ赤い文字のあれです
            }


        /*動作確認*/System.out.println("TourListDAO : 取得データ数 : " + selectList.size());
        return selectList;
        }

}