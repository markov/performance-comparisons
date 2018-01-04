package org.gradle.test.performance2_4

import org.junit.Assert.*

class Test2_317 {
    private val production = Production2_317("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}