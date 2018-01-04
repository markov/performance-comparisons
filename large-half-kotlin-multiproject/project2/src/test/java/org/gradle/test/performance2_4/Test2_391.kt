package org.gradle.test.performance2_4

import org.junit.Assert.*

class Test2_391 {
    private val production = Production2_391("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}