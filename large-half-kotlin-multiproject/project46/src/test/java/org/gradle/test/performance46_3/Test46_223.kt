package org.gradle.test.performance46_3

import org.junit.Assert.*

class Test46_223 {
    private val production = Production46_223("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}
