package dev.shreyaspatil.foodium.ui.details;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import dev.shreyaspatil.foodium.data.repository.PostsRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class PostDetailsViewModel_AssistedFactory implements ViewModelAssistedFactory<PostDetailsViewModel> {
  private final Provider<PostsRepository> postsRepository;

  @Inject
  PostDetailsViewModel_AssistedFactory(Provider<PostsRepository> postsRepository) {
    this.postsRepository = postsRepository;
  }

  @Override
  @NonNull
  public PostDetailsViewModel create(@NonNull SavedStateHandle arg0) {
    return new PostDetailsViewModel(postsRepository.get());
  }
}
