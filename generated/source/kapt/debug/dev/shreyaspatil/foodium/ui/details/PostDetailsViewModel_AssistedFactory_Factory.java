package dev.shreyaspatil.foodium.ui.details;

import dagger.internal.Factory;
import dev.shreyaspatil.foodium.data.repository.PostsRepository;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PostDetailsViewModel_AssistedFactory_Factory implements Factory<PostDetailsViewModel_AssistedFactory> {
  private final Provider<PostsRepository> postsRepositoryProvider;

  public PostDetailsViewModel_AssistedFactory_Factory(
      Provider<PostsRepository> postsRepositoryProvider) {
    this.postsRepositoryProvider = postsRepositoryProvider;
  }

  @Override
  public PostDetailsViewModel_AssistedFactory get() {
    return newInstance(postsRepositoryProvider);
  }

  public static PostDetailsViewModel_AssistedFactory_Factory create(
      Provider<PostsRepository> postsRepositoryProvider) {
    return new PostDetailsViewModel_AssistedFactory_Factory(postsRepositoryProvider);
  }

  public static PostDetailsViewModel_AssistedFactory newInstance(
      Provider<PostsRepository> postsRepository) {
    return new PostDetailsViewModel_AssistedFactory(postsRepository);
  }
}
