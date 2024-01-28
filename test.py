import re

def remove_comments_and_whitespace(input_file, output_file):
    # Read the input file
    with open(input_file, 'r') as file:
        lines = file.readlines()
    # Remove comments and whitespaces
    cleaned_lines = []
    for line in lines:
        # Remove single-line comments
        line = re.sub(r'//.*', '', line)
        # Remove multi-line comments
        line = re.sub(r'/\*.*?\*/', '', line)
        # Remove # comments
        line = re.sub(r'#.*', '', line)
        # Remove leading and trailing whitespaces
        line = line.strip()
        if line:
            cleaned_lines.append(line)

    # Write the cleaned lines to the output file
    with open(output_file, 'w') as file:
        file.write('\n'.join(cleaned_lines))

    # Get the number of lines in the cleaned file
    num_lines = len(cleaned_lines)

    return num_lines

# Example usage
input_file = 'test2.py'  # Change this to your input file
output_file = 'output_program_cleaned1y'  # Change this to your desired output file

num_lines = remove_comments_and_whitespace(input_file, output_file)

print(f'Number of lines in the cleaned file: {num_lines}')
print(f'Cleaned file saved as: {output_file}')
