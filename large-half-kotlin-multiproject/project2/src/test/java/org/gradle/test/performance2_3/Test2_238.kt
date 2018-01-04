package org.gradle.test.performance2_3

import org.junit.Assert.*

class Test2_238 {
    private val production = Production2_238("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}