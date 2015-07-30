// Code generated by dagger-compiler.  Do not edit.
package com.viethoa.siliconstraits.testing.services;

import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

/**
 * A {@code Binding<UserPhotoService>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 *
 * Owning the dependency links between {@code UserPhotoService} and its
 * dependencies.
 *
 * Being a {@code Provider<UserPhotoService>} and handling creation and
 * preparation of object instances.
 *
 * Being a {@code MembersInjector<UserPhotoService>} and handling injection
 * of annotated fields.
 */
public final class UserPhotoService$$InjectAdapter extends Binding<UserPhotoService>
    implements Provider<UserPhotoService>, MembersInjector<UserPhotoService> {
  private Binding<com.viethoa.siliconstraits.testing.daggers.managers.FlickrManager> flickrManager;
  private Binding<de.greenrobot.event.EventBus> eventBus;

  public UserPhotoService$$InjectAdapter() {
    super("com.viethoa.siliconstraits.testing.services.UserPhotoService", "members/com.viethoa.siliconstraits.testing.services.UserPhotoService", NOT_SINGLETON, UserPhotoService.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    flickrManager = (Binding<com.viethoa.siliconstraits.testing.daggers.managers.FlickrManager>) linker.requestBinding("com.viethoa.siliconstraits.testing.daggers.managers.FlickrManager", UserPhotoService.class, getClass().getClassLoader());
    eventBus = (Binding<de.greenrobot.event.EventBus>) linker.requestBinding("de.greenrobot.event.EventBus", UserPhotoService.class, getClass().getClassLoader());
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    injectMembersBindings.add(flickrManager);
    injectMembersBindings.add(eventBus);
  }

  /**
   * Returns the fully provisioned instance satisfying the contract for
   * {@code Provider<UserPhotoService>}.
   */
  @Override
  public UserPhotoService get() {
    UserPhotoService result = new UserPhotoService();
    injectMembers(result);
    return result;
  }

  /**
   * Injects any {@code @Inject} annotated fields in the given instance,
   * satisfying the contract for {@code Provider<UserPhotoService>}.
   */
  @Override
  public void injectMembers(UserPhotoService object) {
    object.flickrManager = flickrManager.get();
    object.eventBus = eventBus.get();
  }

}
