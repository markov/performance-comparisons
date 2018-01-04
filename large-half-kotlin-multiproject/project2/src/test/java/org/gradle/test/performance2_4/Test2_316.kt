package org.gradle.test.performance2_4

import org.junit.Assert.*

class Test2_316 {
    private val production = Production2_316("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}