package codeguru.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.LinearLayout;

public class CheckableLinearLayout extends LinearLayout implements Checkable{

    public CheckableLinearLayout(Context context) {
        super(context);
    }

    public CheckableLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public CheckableLinearLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    /**
     * Change the checked state of the view
     *
     * @param checked The new checked state
     */
    @Override
    public void setChecked(boolean checked) {

    }

    /**
     * @return The current checked state of the view
     */
    @Override
    public boolean isChecked() {
        return false;
    }

    /**
     * Change the checked state of the view to the inverse of its current state
     */
    @Override
    public void toggle() {

    }

}
