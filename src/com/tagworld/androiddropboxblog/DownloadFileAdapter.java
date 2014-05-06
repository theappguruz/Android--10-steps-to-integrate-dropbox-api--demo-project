package com.tagworld.androiddropboxblog;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.dropbox.client2.DropboxAPI.Entry;

public class DownloadFileAdapter extends BaseAdapter {

	// private Context context;
	private ArrayList<Entry> files;
	private View view;
	private LayoutInflater lInflater;

	public DownloadFileAdapter(Context context, ArrayList<Entry> files) {
		// this.context = context;
		this.files = files;
		lInflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		return files.size();
	}

	@Override
	public Object getItem(int position) {
		return position;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	private class Holder {
		ImageView ivImageFolderOrFile, ivImageDownloadOrBrowableDir;
		TextView tvDownloadFileOrFolderName;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		final Holder holder;
		view = convertView;
		if (view == null) {
			holder = new Holder();
			view = lInflater.inflate(R.layout.downloadfileinflater, null);
			holder.ivImageDownloadOrBrowableDir = (ImageView) view
					.findViewById(R.id.ivImageDownloadOrBrowableDir);
			holder.ivImageFolderOrFile = (ImageView) view
					.findViewById(R.id.ivImageFolderOrFile);
			holder.tvDownloadFileOrFolderName = (TextView) view
					.findViewById(R.id.tvDownloadFileFileName);
			view.setTag(holder);
		} else {
			holder = (Holder) view.getTag();
		}
		Entry file = files.get(position);
		if (!file.isDir) {
			holder.ivImageDownloadOrBrowableDir
					.setImageResource(R.drawable.downloadicon);
			holder.ivImageFolderOrFile.setImageResource(R.drawable.fileicon);
		} else {
			holder.ivImageDownloadOrBrowableDir
					.setImageResource(R.drawable.browsedirectoryicon);
			holder.ivImageFolderOrFile
					.setImageResource(R.drawable.dropboxdiricon);
		}
		holder.tvDownloadFileOrFolderName.setText(file.fileName());
		return view;
	}

}
