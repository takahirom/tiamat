package tiamat.sample;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
interface AppComponent {
    void inject(MainActivity activity);

    void inject(NextActivity activity);
}
