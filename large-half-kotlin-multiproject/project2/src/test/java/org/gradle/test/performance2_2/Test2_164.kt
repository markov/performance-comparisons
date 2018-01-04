package org.gradle.test.performance2_2

import org.junit.Assert.*

class Test2_164 {
    private val production = Production2_164("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}