package org.gradle.test.performance4_5

import org.junit.Assert.*

class Test4_406 {
    private val production = Production4_406("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}