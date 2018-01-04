package org.gradle.test.performance2_5

import org.junit.Assert.*

class Test2_409 {
    private val production = Production2_409("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}