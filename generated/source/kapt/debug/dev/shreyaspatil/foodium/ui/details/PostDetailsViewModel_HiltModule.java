package dev.shreyaspatil.foodium.ui.details;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = PostDetailsViewModel.class
)
public interface PostDetailsViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("dev.shreyaspatil.foodium.ui.details.PostDetailsViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(PostDetailsViewModel_AssistedFactory factory);
}
