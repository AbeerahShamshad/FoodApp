package dev.shreyaspatil.foodium.data.repository;

import dagger.internal.Factory;
import dev.shreyaspatil.foodium.data.local.dao.PostsDao;
import dev.shreyaspatil.foodium.data.remote.api.FoodiumService;
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
public final class PostsRepository_Factory implements Factory<PostsRepository> {
  private final Provider<PostsDao> postsDaoProvider;

  private final Provider<FoodiumService> foodiumServiceProvider;

  public PostsRepository_Factory(Provider<PostsDao> postsDaoProvider,
      Provider<FoodiumService> foodiumServiceProvider) {
    this.postsDaoProvider = postsDaoProvider;
    this.foodiumServiceProvider = foodiumServiceProvider;
  }

  @Override
  public PostsRepository get() {
    return newInstance(postsDaoProvider.get(), foodiumServiceProvider.get());
  }

  public static PostsRepository_Factory create(Provider<PostsDao> postsDaoProvider,
      Provider<FoodiumService> foodiumServiceProvider) {
    return new PostsRepository_Factory(postsDaoProvider, foodiumServiceProvider);
  }

  public static PostsRepository newInstance(PostsDao postsDao, FoodiumService foodiumService) {
    return new PostsRepository(postsDao, foodiumService);
  }
}
