package com.internousdev.choitabi.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author SHUN NAGAO
 * @since 2017/09/12
 * @version 1.1
 */
public class MySQLConnector {

    /**
     * DBドライバーネーム
     */
    private String driverName = "com.mysql.jdbc.Driver";

    /**
     * 接続url
     */
    private String url = "jdbc:mysql://localhost/openconnect";

    /**
     * ユーザー名
     */
    private String user = "root";

    /**
     * パスワード
     */
    private String password = "mysql";

    /**
     * データベース名
     */
    private String dataBaseName;

    /**
     * ビルドURL
     */
    private StringBuilder URL = new StringBuilder(String.valueOf(url));


    /**
     * @author SHUN NAGAO
     * @since 2017/09/12
     * @version 1.1
     * @param driverName DBドライバーネーム
     * @param url 接続URL
     * @param dataBaseName DB名
     * @param user ユーザー名
     * @param password パスワード
     */
    public MySQLConnector(String driverName,String url,String dataBaseName, String user, String password){

        this.driverName = driverName;
        this.url = url;
        this.user = user;
        this.password = password;
        this.setDataBaseName(dataBaseName);

        URL.append(dataBaseName);
        }

    public MySQLConnector(String dataBaseName){
        this.setDataBaseName(dataBaseName);
        URL.append(dataBaseName);
        }

    public Connection getConnection(){
        Connection con = null;

        try{
            Class.forName(driverName);
            con = DriverManager.getConnection((new StringBuilder(String.valueOf(url))).append(dataBaseName).toString(), user, password);

        }catch(ClassNotFoundException e){
            e.printStackTrace();

        }catch(SQLException e){
            e.printStackTrace();
            }

        return con;
        }


    /**
     * DBドライバーネームを取得するメソッド
     * @return driverName DBドライバーネーム
     */
    public String getDriverName() {
        return driverName;
        }

    /**
     * DBドライバーネームを格納するメソッド
     * @param driverName セットする driverName
     */
    public void setDriverName(String driverName) {
        this.driverName = driverName;
        }

    /**
     * 接続urlを取得するメソッド
     * @return url 接続url
     */
    public String getUrl() {
        return url;
        }

    /**
     * 接続urlを格納するメソッド
     * @param url セットする url
     */
    public void setUrl(String url) {
        this.url = url;
        }

    /**
     * ユーザー名を取得するメソッド
     * @return user ユーザー名
     */
    public String getUser() {
        return user;
        }

    /**
     * ユーザー名を格納するメソッド
     * @param user セットする user
     */
    public void setUser(String user) {
        this.user = user;
        }

    /**
     * パスワードを取得するメソッド
     * @return password パスワード
     */
    public String getPassword() {
        return password;
        }

    /**
     * パスワードを格納するメソッド
     * @param password セットする password
     */
    public void setPassword(String password) {
        this.password = password;
        }

    /**
     * DB名を取得するメソッド
     * @return dataBaseName DB名
     */
    public String getDataBaseName() {
        return dataBaseName;
        }

    /**
     * DB名を格納するメソッド
     * @param dataBaseName セットする dataBaseName
     */
    public void setDataBaseName(String dataBaseName) {
        this.dataBaseName = dataBaseName;
        }

    /**
     * ビルドURLを取得するメソッド
     * @return uRL ビルドURL
     */
    public StringBuilder getURL() {
        return URL;
        }

    /**
     * ビルドURLを格納するメソッド
     * @param uRL セットする uRL
     */
    public void setURL(StringBuilder uRL) {
        URL = uRL;
        }

}