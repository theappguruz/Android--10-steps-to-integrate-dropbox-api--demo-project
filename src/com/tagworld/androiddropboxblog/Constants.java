package com.tagworld.androiddropboxblog;

import java.util.HashMap;

import android.graphics.Bitmap;
import android.os.Environment;

import com.dropbox.client2.session.Session.AccessType;

public class Constants {

//	public static final String CONSUMER_KEY = "it6aZlVLYajcv1Dl6CB5Q";
//	public static final String CONSUMER_SECRET = "qTvXcJPUZIr2r5XOQxA92Cf4jYxvbrbUpvBLFw85DD4";
//
//	public static final String REQUEST_URL = "http://api.twitter.com/oauth/request_token";
//	public static final String ACCESS_URL = "http://api.twitter.com/oauth/access_token";
//	public static final String AUTHORIZE_URL = "http://api.twitter.com/oauth/authorize";
//
//	public static final String OAUTH_CALLBACK_SCHEME = "x-oauthflow-twitter";
//	public static final String OAUTH_CALLBACK_HOST = "callback";
//	public static final String OAUTH_CALLBACK_URL = OAUTH_CALLBACK_SCHEME
//			+ "://" + OAUTH_CALLBACK_HOST;
//
//	public static final int BASE_SIZE = 100;
//	public static final int BASE_VIEWER_HEIGHT_SIZE = 300;
//
//	public static final HashMap<String, Bitmap> PATH_TO_BITMAP = new HashMap<String, Bitmap>();
//	public static final String DIRECTORY_PATH = Environment
//			.getExternalStorageDirectory().toString()
//			+ "/Android/data/com.theappguruz.docview";
//	public static final int ADD_FOLDER = 1;
//	public static final int TAKE_PHOTO = 2;
//	public static final int CHOOSE_FROM_GALLERY = 3;
	public static final String OVERRIDEMSG = "File name with this name already exists.Do you want to replace this file?";
	final static public String DROPBOX_APP_KEY = "n81vuqu3mfexf6i";
	final static public String DROPBOX_APP_SECRET = "jlq5je674x0zmcn";
	public static boolean mLoggedIn = false;

	final static public AccessType ACCESS_TYPE = AccessType.DROPBOX;

	final static public String ACCOUNT_PREFS_NAME = "prefs";
	final static public String ACCESS_KEY_NAME = "ACCESS_KEY";
	final static public String ACCESS_SECRET_NAME = "ACCESS_SECRET";
//	public static final int BOOKMARKS = 4;
//	public static final int OPENFILE = 5;

}
