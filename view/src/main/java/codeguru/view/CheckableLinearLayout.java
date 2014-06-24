package codeguru.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.LinearLayout;
import codeguru.checkablelinearlayout.R;

public class CheckableLinearLayout extends LinearLayout implements Checkable {

    private final CheckBox mCheckBox;

    public CheckableLinearLayout(Context context) {
        this(context, null);
    }

    public CheckableLinearLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public CheckableLinearLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        ViewGroup root = (ViewGroup) ViewGroup.inflate(context, R.layout.checkable_linear_layout, this);
        mCheckBox = (CheckBox) root.findViewById(R.id.checkbox);
    }

    /**
     * Change the checked state of the view
     *
     * @param checked The new checked state
     */
    @Override
    public void setChecked(boolean checked) {
        mCheckBox.setChecked(checked);
    }

    /**
     * @return The current checked state of the view
     */
    @Override
    public boolean isChecked() {
        return mCheckBox.isChecked();
    }

    /**
     * Change the checked state of the view to the inverse of its current state
     */
    @Override
    public void toggle() {
        mCheckBox.toggle();
    }

}
