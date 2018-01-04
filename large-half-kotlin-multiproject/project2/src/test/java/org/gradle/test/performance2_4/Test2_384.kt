package org.gradle.test.performance2_4

import org.junit.Assert.*

class Test2_384 {
    private val production = Production2_384("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}