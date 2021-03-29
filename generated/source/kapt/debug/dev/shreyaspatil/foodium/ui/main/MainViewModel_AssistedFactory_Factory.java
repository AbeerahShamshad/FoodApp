package dev.shreyaspatil.foodium.ui.main;

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
public final class MainViewModel_AssistedFactory_Factory implements Factory<MainViewModel_AssistedFactory> {
  private final Provider<PostsRepository> postsRepositoryProvider;

  public MainViewModel_AssistedFactory_Factory(Provider<PostsRepository> postsRepositoryProvider) {
    this.postsRepositoryProvider = postsRepositoryProvider;
  }

  @Override
  public MainViewModel_AssistedFactory get() {
    return newInstance(postsRepositoryProvider);
  }

  public static MainViewModel_AssistedFactory_Factory create(
      Provider<PostsRepository> postsRepositoryProvider) {
    return new MainViewModel_AssistedFactory_Factory(postsRepositoryProvider);
  }

  public static MainViewModel_AssistedFactory newInstance(
      Provider<PostsRepository> postsRepository) {
    return new MainViewModel_AssistedFactory(postsRepository);
  }
}
