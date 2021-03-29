package dev.shreyaspatil.foodium.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.shreyaspatil.foodium.data.local.FoodiumPostsDatabase;
import dev.shreyaspatil.foodium.data.local.dao.PostsDao;
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
public final class FoodiumDatabaseModule_ProvidePostsDaoFactory implements Factory<PostsDao> {
  private final FoodiumDatabaseModule module;

  private final Provider<FoodiumPostsDatabase> databaseProvider;

  public FoodiumDatabaseModule_ProvidePostsDaoFactory(FoodiumDatabaseModule module,
      Provider<FoodiumPostsDatabase> databaseProvider) {
    this.module = module;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public PostsDao get() {
    return providePostsDao(module, databaseProvider.get());
  }

  public static FoodiumDatabaseModule_ProvidePostsDaoFactory create(FoodiumDatabaseModule module,
      Provider<FoodiumPostsDatabase> databaseProvider) {
    return new FoodiumDatabaseModule_ProvidePostsDaoFactory(module, databaseProvider);
  }

  public static PostsDao providePostsDao(FoodiumDatabaseModule instance,
      FoodiumPostsDatabase database) {
    return Preconditions.checkNotNull(instance.providePostsDao(database), "Cannot return null from a non-@Nullable @Provides method");
  }
}
