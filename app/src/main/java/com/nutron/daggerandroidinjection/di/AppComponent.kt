package com.nutron.daggerandroidinjection.di

import android.app.Application
import com.nutron.daggerandroidinjection.MainApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule


interface ComponentBuilder<out C> {
    fun build(): C
}

@Component(modules = [
    AndroidInjectionModule::class,
    AppModule::class,
    ActivityBinder::class])
interface AppComponent {

    fun inject(app: MainApplication)

    @Component.Builder
    interface Builder : ComponentBuilder<AppComponent> {

        /**
         * will allow clients of this builder to pass their own instances,
         * and those instances can be injected within the component
         */
        @BindsInstance
        fun application(application: Application): Builder
    }

}

//@Component(modules = [
//    AndroidInjectionModule::class,
//    AppModule::class,
//    ActivityBinder::class])
//interface AppComponent : AndroidInjector<DaggerApplication> {
//
//    fun inject(app: MainApplication)
//    override fun inject(instance: DaggerApplication)
//
//    @Component.Builder
//    interface Builder : ComponentBuilder<AppComponent> {
//        /**
//         * will allow clients of this builder to pass their own instances,
//         * and those instances can be injected within the component
//         */
//        @BindsInstance
//        fun application(application: Application): Builder
//    }
//}
