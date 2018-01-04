package org.gradle.test.performance46_3

import org.junit.Assert.*

class Test46_278 {
    private val production = Production46_278("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
