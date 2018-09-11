package realization;

public class Main {
	
	public static void main(String[] args)  {	
		
		Method.getMenus();
	}	public static void getMenus()
	{
		boolean restart = false;
		String option;

		do {

			try {
				System.out.println("\n******************************************"
						+ "\nWelcome !"
						+ "\n******************************************");

//				UserImpl user = new UserImpl();
//				user = userMenu(user);
//
//				Group group = new Group();
				// infinte loop.
				do {
					/*group = groupMenu(user);

					contactMenu(user, group);*/
					System.out.println("+++");
				} while (true);
			}

			// to catch any exception happenes in the project.
			catch (Exception e)
			{
				try {
					System.out.println("\nSystem Failure !");
					option = Method.getInput("Do you want to restart? ", 3, "", false);
					if( option.equalsIgnoreCase("y"))
						restart = true;
					else
					{
						System.out.print("Good bye ! ");
						Thread.sleep(500);
						System.exit(1);
					}

				}
				catch (Exception e1) {
					System.out.print("\nGood bye ! ");
					Method.loadDelay(2, false);
					System.exit(1);
				}
			}

		} while (restart);
	}
}
