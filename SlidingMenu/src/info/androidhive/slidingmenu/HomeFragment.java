package info.androidhive.slidingmenu;




import android.app.Fragment;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class HomeFragment extends Fragment {
	
	public HomeFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        TextView tv1 = (TextView)rootView.findViewById(R.id.name1);
		tv1.setText(Html.fromHtml(getResources().getString(R.string.name1)));
		tv1.setMovementMethod(LinkMovementMethod.getInstance());
        return rootView;
    }
}
