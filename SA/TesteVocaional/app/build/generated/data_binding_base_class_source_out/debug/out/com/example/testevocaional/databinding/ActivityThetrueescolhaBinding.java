// Generated by view binder compiler. Do not edit!
package com.example.testevocaional.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.testevocaional.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityThetrueescolhaBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageView18;

  @NonNull
  public final TextView textView12;

  @NonNull
  public final TextView textView18;

  @NonNull
  public final TextView textView19;

  private ActivityThetrueescolhaBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView imageView18, @NonNull TextView textView12, @NonNull TextView textView18,
      @NonNull TextView textView19) {
    this.rootView = rootView;
    this.imageView18 = imageView18;
    this.textView12 = textView12;
    this.textView18 = textView18;
    this.textView19 = textView19;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityThetrueescolhaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityThetrueescolhaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_thetrueescolha, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityThetrueescolhaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView18;
      ImageView imageView18 = ViewBindings.findChildViewById(rootView, id);
      if (imageView18 == null) {
        break missingId;
      }

      id = R.id.textView12;
      TextView textView12 = ViewBindings.findChildViewById(rootView, id);
      if (textView12 == null) {
        break missingId;
      }

      id = R.id.textView18;
      TextView textView18 = ViewBindings.findChildViewById(rootView, id);
      if (textView18 == null) {
        break missingId;
      }

      id = R.id.textView19;
      TextView textView19 = ViewBindings.findChildViewById(rootView, id);
      if (textView19 == null) {
        break missingId;
      }

      return new ActivityThetrueescolhaBinding((ConstraintLayout) rootView, imageView18, textView12,
          textView18, textView19);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
