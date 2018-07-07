package de.leuphana.swa.organisationService.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrganisationView {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public String askGroupName() throws IOException {
		
		System.out.println("What is the Group Name ?");
		
		String groupName = br.readLine();
		
		return groupName;
	}
	
	public String askOrgUnitName() throws IOException {
		
		System.out.println("What is the OrganisationUnit Name ?");
		
		String orgUnitName = br.readLine();
		
		return orgUnitName;
	}
	
	public int shouldPersonAddedGroup() throws IOException {
		System.out.println("Should this person be added to group ?");
		System.out.println("1: Yes");
		System.out.println("2: No");
		
		int i = Integer.parseInt(br.readLine());
		return i;
	}
	
	public int shouldPersonRemovedGroup() throws IOException {
		System.out.println("Should this person be removed from group ?");
		System.out.println("1: Yes");
		System.out.println("2: No");
		
		int i = Integer.parseInt(br.readLine());
		return i;
	}
	
	public int shouldGroupAddedOrgUnit() throws IOException {
		System.out.println("Should this group be added to organisation ?");
		System.out.println("1: Yes");
		System.out.println("2: No");
		
		int i = Integer.parseInt(br.readLine());
		return i;
	}
	
	public int shouldGroupRemovedOrgUnit() throws IOException {
		System.out.println("Should this group be removed from organisation ?");
		System.out.println("1: Yes");
		System.out.println("2: No");
		
		int i = Integer.parseInt(br.readLine());
		return i;
	}
	
}
