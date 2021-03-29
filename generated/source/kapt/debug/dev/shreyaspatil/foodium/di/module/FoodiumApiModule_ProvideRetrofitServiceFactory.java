package dev.shreyaspatil.foodium.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dev.shreyaspatil.foodium.data.remote.api.FoodiumService;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FoodiumApiModule_ProvideRetrofitServiceFactory implements Factory<FoodiumService> {
  private final FoodiumApiModule module;

  public FoodiumApiModule_ProvideRetrofitServiceFactory(FoodiumApiModule module) {
    this.module = module;
  }

  @Override
  public FoodiumService get() {
    return provideRetrofitService(module);
  }

  public static FoodiumApiModule_ProvideRetrofitServiceFactory create(FoodiumApiModule module) {
    return new FoodiumApiModule_ProvideRetrofitServiceFactory(module);
  }

  public static FoodiumService provideRetrofitService(FoodiumApiModule instance) {
    return Preconditions.checkNotNull(instance.provideRetrofitService(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
