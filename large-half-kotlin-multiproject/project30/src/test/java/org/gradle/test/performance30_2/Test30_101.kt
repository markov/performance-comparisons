package org.gradle.test.performance30_2

import org.junit.Assert.*

class Test30_101 {
    private val production = Production30_101("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}