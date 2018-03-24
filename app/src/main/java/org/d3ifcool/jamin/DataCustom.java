package org.d3ifcool.jamin;

/**
 * Created by Fery Suyatna on 13/03/2018.
 */

public class DataCustom {
    private String mlist;
    private int mImageResourseId;

    public DataCustom(String list){
        mlist = list;
    }
    public DataCustom(String list,int imageResourseId ){
        mlist = list;
        mImageResourseId = imageResourseId;
    }
    public String getMlist() {
        return mlist;
    }
    public  int getmImageResourseId(){ return mImageResourseId;}

}
