package org.gradle.test.performance2_4

import org.junit.Assert.*

class Test2_311 {
    private val production = Production2_311("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}