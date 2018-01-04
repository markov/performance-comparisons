package org.gradle.test.performance46_3

import org.junit.Assert.*

class Test46_250 {
    private val production = Production46_250("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
