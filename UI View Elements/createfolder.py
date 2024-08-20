import os

def create_folders_from_file(file_path, home_folder='C:/_Amrita/MAD_V2/CAL/'):
    try:
        # Create the home folder if it doesn't exist
        if not os.path.exists(home_folder):
            os.makedirs(home_folder)
            print(f"Home folder '{home_folder}' created.")
        else:
            print(f"Home folder '{home_folder}' already exists.")
        
        # Read the names from the file
        with open(file_path, 'r') as file:
            names = file.readlines()

        # Clean up any leading/trailing whitespace and newlines from names
        names = [name.strip() for name in names if name.strip()]

        for name in names:
            folder_path = os.path.join(home_folder, name)
            if not os.path.exists(folder_path):
                os.makedirs(folder_path)
                print(f"Folder '{folder_path}' created.")
            else:
                print(f"Folder '{folder_path}' already exists.")

    except Exception as e:
        print(f"An error occurred: {e}")

# Example usage
file_path = 'C:/_Amrita/MAD_V2/CAL/folder.txt'  # Replace with the path to your file
create_folders_from_file(file_path)
