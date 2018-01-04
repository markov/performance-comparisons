package org.gradle.test.performance19_4

import org.junit.Assert.*

class Test19_305 {
    private val production = Production19_305("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}