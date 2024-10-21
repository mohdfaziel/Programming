#include <stdio.h>

int main() {
    FILE *inputFile, *oddFile, *evenFile;
    int num;

    inputFile = fopen("input", "r");
    if (inputFile == NULL) {
        printf("Failed to open the input file\n");
        return 1;
    }

    oddFile = fopen("ODD", "w");
    if (oddFile == NULL) {
        printf("Failed to create the ODD file\n");
        fclose(inputFile);
        return 1;
    }

    evenFile = fopen("EVEN", "w");
    if (evenFile == NULL) {
        printf("Failed to create the EVEN file\n");
        fclose(inputFile);
        fclose(oddFile);
        return 1;
    }

    while (fscanf(inputFile, "%d", &num) != EOF) {
        if (num % 2 == 0) {
            fprintf(evenFile, "%d\n", num);
        } else {
            fprintf(oddFile, "%d\n", num);
        }
    }

    fclose(inputFile);
    fclose(oddFile);
    fclose(evenFile);

    printf("Odd and even numbers are successfully written to ODD and EVEN files.\n");

    return 0;
}
