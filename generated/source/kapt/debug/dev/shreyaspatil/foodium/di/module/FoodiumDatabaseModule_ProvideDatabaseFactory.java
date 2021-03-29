package dev.shreyaspatil.foodium.di.module;

import android.app.Application;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.shreyaspatil.foodium.data.local.FoodiumPostsDatabase;
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
public final class FoodiumDatabaseModule_ProvideDatabaseFactory implements Factory<FoodiumPostsDatabase> {
  private final FoodiumDatabaseModule module;

  private final Provider<Application> applicationProvider;

  public FoodiumDatabaseModule_ProvideDatabaseFactory(FoodiumDatabaseModule module,
      Provider<Application> applicationProvider) {
    this.module = module;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public FoodiumPostsDatabase get() {
    return provideDatabase(module, applicationProvider.get());
  }

  public static FoodiumDatabaseModule_ProvideDatabaseFactory create(FoodiumDatabaseModule module,
      Provider<Application> applicationProvider) {
    return new FoodiumDatabaseModule_ProvideDatabaseFactory(module, applicationProvider);
  }

  public static FoodiumPostsDatabase provideDatabase(FoodiumDatabaseModule instance,
      Application application) {
    return Preconditions.checkNotNull(instance.provideDatabase(application), "Cannot return null from a non-@Nullable @Provides method");
  }
}
