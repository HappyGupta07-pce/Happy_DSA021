#include <stdio.h>
#include <stdint.h>
int main() {
    printf("=== Array Storage and Address Calculation on 32-bit Compiler ===\n\n");

    // 1D Array
    int a1[5] = {10, 20, 30, 40, 50};
    printf("1D Array:\n");
    for (int i = 0; i < 5; i++) {
        printf("Address of a1[%d] = %p, Value = %d\n", i, (void*)&a1[i], a1[i]);
    }
    printf("\n");

    // 2D Array
    int a2[3][4] = {
        {11, 12, 13, 14},
        {21, 22, 23, 24},
        {31, 32, 33, 34}
    };
    printf("2D Array (3x4):\n");
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
            printf("Address of a2[%d][%d] = %p, Value = %d\n", i, j, (void*)&a2[i][j], a2[i][j]);
        }
    }
    printf("\n");

    // Word Size Verification
    printf("\nSize of int (word size on 32-bit system) = %zu bytes\n", sizeof(int));

    // Theoretical Address Calculation (example)
    printf("\n=== Theoretical Address Calculation Example ===\n");
    int base_address = (int)(uintptr_t)&a2[0][0]; // Base address of 2D array
    int i = 2, j = 3;
    int cols = 4;
    int offset = (i * cols + j) * sizeof(int);
    int theoretical_address = base_address + offset;
    int actual_address = (int)(uintptr_t)&a2[i][j];

    printf("Base address of a2[0][0] = %p\n", (void*)base_address);
    printf("Calculated address of a2[%d][%d] = %p\n", i, j, (void*)theoretical_address);
    printf("Actual address of a2[%d][%d] = %p\n", i, j, (void*)actual_address);

    if (theoretical_address == actual_address) {
        printf("✅ Theoretical and actual addresses match.\n");
    } else {
        printf("❌ Mismatch in theoretical and actual addresses.\n");
    }

    return 0;
}
