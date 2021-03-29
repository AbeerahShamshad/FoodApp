package dev.shreyaspatil.foodium.ui.main;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import dev.shreyaspatil.foodium.data.repository.PostsRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class MainViewModel_AssistedFactory implements ViewModelAssistedFactory<MainViewModel> {
  private final Provider<PostsRepository> postsRepository;

  @Inject
  MainViewModel_AssistedFactory(Provider<PostsRepository> postsRepository) {
    this.postsRepository = postsRepository;
  }

  @Override
  @NonNull
  public MainViewModel create(@NonNull SavedStateHandle arg0) {
    return new MainViewModel(postsRepository.get());
  }
}
