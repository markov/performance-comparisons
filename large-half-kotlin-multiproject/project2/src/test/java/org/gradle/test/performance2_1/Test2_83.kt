package org.gradle.test.performance2_1

import org.junit.Assert.*

class Test2_83 {
    private val production = Production2_83("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}