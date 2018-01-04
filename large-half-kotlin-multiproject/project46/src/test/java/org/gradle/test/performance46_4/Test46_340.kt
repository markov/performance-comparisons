package org.gradle.test.performance46_4

import org.junit.Assert.*

class Test46_340 {
    private val production = Production46_340("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
