package codeguru.checkablelinearlayout.example;

import android.view.ActionMode;
import android.view.View;
import android.widget.Checkable;
import android.widget.ListView;

public class CheckableListener implements View.OnClickListener {

    private final MainActivity mActivity;

    private ListView mListView;

    private final int mPosition;

    private ActionMode mMode;

    public CheckableListener(MainActivity activity, int position) {
        mActivity = activity;
        mListView = (ListView) activity.findViewById(android.R.id.list);
        mPosition = position;
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        if (mMode != null) {
            mMode = mListView.startActionMode(new ExampleMultiChoiceModeListener(mActivity));
        }

        mListView.setItemChecked(mPosition, ((Checkable) v).isChecked());
    }
}
