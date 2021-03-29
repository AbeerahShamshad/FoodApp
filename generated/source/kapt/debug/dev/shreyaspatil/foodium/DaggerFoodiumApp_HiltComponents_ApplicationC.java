package dev.shreyaspatil.foodium;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import dev.shreyaspatil.foodium.data.local.FoodiumPostsDatabase;
import dev.shreyaspatil.foodium.data.local.dao.PostsDao;
import dev.shreyaspatil.foodium.data.remote.api.FoodiumService;
import dev.shreyaspatil.foodium.data.repository.PostsRepository;
import dev.shreyaspatil.foodium.di.module.FoodiumApiModule;
import dev.shreyaspatil.foodium.di.module.FoodiumApiModule_ProvideRetrofitServiceFactory;
import dev.shreyaspatil.foodium.di.module.FoodiumDatabaseModule;
import dev.shreyaspatil.foodium.di.module.FoodiumDatabaseModule_ProvideDatabaseFactory;
import dev.shreyaspatil.foodium.di.module.FoodiumDatabaseModule_ProvidePostsDaoFactory;
import dev.shreyaspatil.foodium.ui.details.PostDetailsActivity;
import dev.shreyaspatil.foodium.ui.details.PostDetailsViewModel_AssistedFactory;
import dev.shreyaspatil.foodium.ui.details.PostDetailsViewModel_AssistedFactory_Factory;
import dev.shreyaspatil.foodium.ui.main.MainActivity;
import dev.shreyaspatil.foodium.ui.main.MainViewModel_AssistedFactory;
import dev.shreyaspatil.foodium.ui.main.MainViewModel_AssistedFactory_Factory;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
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
public final class DaggerFoodiumApp_HiltComponents_ApplicationC extends FoodiumApp_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private final FoodiumDatabaseModule foodiumDatabaseModule;

  private final FoodiumApiModule foodiumApiModule;

  private volatile Object foodiumPostsDatabase = new MemoizedSentinel();

  private volatile Object postsDao = new MemoizedSentinel();

  private volatile Object foodiumService = new MemoizedSentinel();

  private volatile Object postsRepository = new MemoizedSentinel();

  private volatile Provider<PostsRepository> postsRepositoryProvider;

  private DaggerFoodiumApp_HiltComponents_ApplicationC(
      ApplicationContextModule applicationContextModuleParam,
      FoodiumApiModule foodiumApiModuleParam, FoodiumDatabaseModule foodiumDatabaseModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
    this.foodiumDatabaseModule = foodiumDatabaseModuleParam;
    this.foodiumApiModule = foodiumApiModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private FoodiumPostsDatabase getFoodiumPostsDatabase() {
    Object local = foodiumPostsDatabase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = foodiumPostsDatabase;
        if (local instanceof MemoizedSentinel) {
          local = FoodiumDatabaseModule_ProvideDatabaseFactory.provideDatabase(foodiumDatabaseModule, ApplicationContextModule_ProvideApplicationFactory.provideApplication(applicationContextModule));
          foodiumPostsDatabase = DoubleCheck.reentrantCheck(foodiumPostsDatabase, local);
        }
      }
    }
    return (FoodiumPostsDatabase) local;
  }

  private PostsDao getPostsDao() {
    Object local = postsDao;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = postsDao;
        if (local instanceof MemoizedSentinel) {
          local = FoodiumDatabaseModule_ProvidePostsDaoFactory.providePostsDao(foodiumDatabaseModule, getFoodiumPostsDatabase());
          postsDao = DoubleCheck.reentrantCheck(postsDao, local);
        }
      }
    }
    return (PostsDao) local;
  }

  private FoodiumService getFoodiumService() {
    Object local = foodiumService;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = foodiumService;
        if (local instanceof MemoizedSentinel) {
          local = FoodiumApiModule_ProvideRetrofitServiceFactory.provideRetrofitService(foodiumApiModule);
          foodiumService = DoubleCheck.reentrantCheck(foodiumService, local);
        }
      }
    }
    return (FoodiumService) local;
  }

  private PostsRepository getPostsRepository() {
    Object local = postsRepository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = postsRepository;
        if (local instanceof MemoizedSentinel) {
          local = new PostsRepository(getPostsDao(), getFoodiumService());
          postsRepository = DoubleCheck.reentrantCheck(postsRepository, local);
        }
      }
    }
    return (PostsRepository) local;
  }

  private Provider<PostsRepository> getPostsRepositoryProvider() {
    Object local = postsRepositoryProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      postsRepositoryProvider = (Provider<PostsRepository>) local;
    }
    return (Provider<PostsRepository>) local;
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  @Override
  public void injectFoodiumApp(FoodiumApp foodiumApp) {
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private FoodiumApiModule foodiumApiModule;

    private FoodiumDatabaseModule foodiumDatabaseModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public Builder foodiumApiModule(FoodiumApiModule foodiumApiModule) {
      this.foodiumApiModule = Preconditions.checkNotNull(foodiumApiModule);
      return this;
    }

    public Builder foodiumDatabaseModule(FoodiumDatabaseModule foodiumDatabaseModule) {
      this.foodiumDatabaseModule = Preconditions.checkNotNull(foodiumDatabaseModule);
      return this;
    }

    public FoodiumApp_HiltComponents.ApplicationC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      if (foodiumApiModule == null) {
        this.foodiumApiModule = new FoodiumApiModule();
      }
      if (foodiumDatabaseModule == null) {
        this.foodiumDatabaseModule = new FoodiumDatabaseModule();
      }
      return new DaggerFoodiumApp_HiltComponents_ApplicationC(applicationContextModule, foodiumApiModule, foodiumDatabaseModule);
    }
  }

  private final class ActivityRetainedCBuilder implements FoodiumApp_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public FoodiumApp_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends FoodiumApp_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements FoodiumApp_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public FoodiumApp_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends FoodiumApp_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<MainViewModel_AssistedFactory> mainViewModel_AssistedFactoryProvider;

      private volatile Provider<PostDetailsViewModel_AssistedFactory> postDetailsViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private MainViewModel_AssistedFactory getMainViewModel_AssistedFactory() {
        return MainViewModel_AssistedFactory_Factory.newInstance(DaggerFoodiumApp_HiltComponents_ApplicationC.this.getPostsRepositoryProvider());
      }

      private Provider<MainViewModel_AssistedFactory> getMainViewModel_AssistedFactoryProvider() {
        Object local = mainViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          mainViewModel_AssistedFactoryProvider = (Provider<MainViewModel_AssistedFactory>) local;
        }
        return (Provider<MainViewModel_AssistedFactory>) local;
      }

      private PostDetailsViewModel_AssistedFactory getPostDetailsViewModel_AssistedFactory() {
        return PostDetailsViewModel_AssistedFactory_Factory.newInstance(DaggerFoodiumApp_HiltComponents_ApplicationC.this.getPostsRepositoryProvider());
      }

      private Provider<PostDetailsViewModel_AssistedFactory> getPostDetailsViewModel_AssistedFactoryProvider(
          ) {
        Object local = postDetailsViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          postDetailsViewModel_AssistedFactoryProvider = (Provider<PostDetailsViewModel_AssistedFactory>) local;
        }
        return (Provider<PostDetailsViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return MapBuilder.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>newMapBuilder(2).put("dev.shreyaspatil.foodium.ui.main.MainViewModel", (Provider) getMainViewModel_AssistedFactoryProvider()).put("dev.shreyaspatil.foodium.ui.details.PostDetailsViewModel", (Provider) getPostDetailsViewModel_AssistedFactoryProvider()).build();
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerFoodiumApp_HiltComponents_ApplicationC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      @Override
      public void injectPostDetailsActivity(PostDetailsActivity postDetailsActivity) {
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      private final class FragmentCBuilder implements FoodiumApp_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public FoodiumApp_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends FoodiumApp_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerFoodiumApp_HiltComponents_ApplicationC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements FoodiumApp_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public FoodiumApp_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends FoodiumApp_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements FoodiumApp_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public FoodiumApp_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends FoodiumApp_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // dev.shreyaspatil.foodium.ui.main.MainViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getMainViewModel_AssistedFactory();

            case 1: // dev.shreyaspatil.foodium.ui.details.PostDetailsViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getPostDetailsViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements FoodiumApp_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public FoodiumApp_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends FoodiumApp_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // dev.shreyaspatil.foodium.data.repository.PostsRepository 
        return (T) DaggerFoodiumApp_HiltComponents_ApplicationC.this.getPostsRepository();

        default: throw new AssertionError(id);
      }
    }
  }
}
