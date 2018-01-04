package org.gradle.test.performance46_2

import org.junit.Assert.*

class Test46_121 {
    private val production = Production46_121("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
