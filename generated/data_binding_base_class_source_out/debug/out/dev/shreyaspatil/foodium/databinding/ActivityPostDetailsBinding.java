// Generated by view binder compiler. Do not edit!
package dev.shreyaspatil.foodium.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import dev.shreyaspatil.foodium.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPostDetailsBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final CollapsingToolbarLayout collapsingToolbar;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ContentPostDetailsBinding postContent;

  @NonNull
  public final Toolbar toolbar;

  private ActivityPostDetailsBinding(@NonNull CoordinatorLayout rootView,
      @NonNull AppBarLayout appbar, @NonNull CollapsingToolbarLayout collapsingToolbar,
      @NonNull ImageView imageView, @NonNull ContentPostDetailsBinding postContent,
      @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.appbar = appbar;
    this.collapsingToolbar = collapsingToolbar;
    this.imageView = imageView;
    this.postContent = postContent;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPostDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPostDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_post_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPostDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appbar;
      AppBarLayout appbar = rootView.findViewById(id);
      if (appbar == null) {
        break missingId;
      }

      id = R.id.collapsing_toolbar;
      CollapsingToolbarLayout collapsingToolbar = rootView.findViewById(id);
      if (collapsingToolbar == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = rootView.findViewById(id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.postContent;
      View postContent = rootView.findViewById(id);
      if (postContent == null) {
        break missingId;
      }
      ContentPostDetailsBinding binding_postContent = ContentPostDetailsBinding.bind(postContent);

      id = R.id.toolbar;
      Toolbar toolbar = rootView.findViewById(id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityPostDetailsBinding((CoordinatorLayout) rootView, appbar, collapsingToolbar,
          imageView, binding_postContent, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
