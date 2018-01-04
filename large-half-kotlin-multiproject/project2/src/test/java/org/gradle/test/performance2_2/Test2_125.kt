package org.gradle.test.performance2_2

import org.junit.Assert.*

class Test2_125 {
    private val production = Production2_125("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}