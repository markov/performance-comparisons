package org.gradle.test.performance19_2

import org.junit.Assert.*

class Test19_186 {
    private val production = Production19_186("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}