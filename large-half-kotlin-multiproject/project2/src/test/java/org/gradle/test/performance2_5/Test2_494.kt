package org.gradle.test.performance2_5

import org.junit.Assert.*

class Test2_494 {
    private val production = Production2_494("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}