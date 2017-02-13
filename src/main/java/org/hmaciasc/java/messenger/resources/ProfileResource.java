package org.hmaciasc.java.messenger.resources;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hmaciasc.java.messenger.model.Profile;
import org.hmaciasc.java.messenger.service.ProfileService;

@Path("/profiles")
public class ProfileResource {

	private ProfileService profileService = new ProfileService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Profile> getProfile() {
		return profileService.getAllProfiles();
	}
	
	@POST
	public Profile addProfile(Profile profile) {
		return profileService.addProfile(profile);
	}
	
	@PUT
	@Path("/{profileName}")
	public Profile updateProfile(@PathParam("profileName") String profileName, Profile profile) {
		profile.setProfileName(profileName);;
		return profileService.updateProfile(profile);
	}
	
	@DELETE
	@Path("/{profileName}")
	public Profile deleteMesage(@PathParam("profileName") String profileName, Profile profile) {
		return profileService.removeProfile(profileName);
	}
	
	@GET
	@Path("/{profileName}")
	public Profile test(@PathParam("profileName") String profileName) {
		return profileService.getProfile(profileName);
	}
}
