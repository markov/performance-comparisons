package org.gradle.test.performance19_4

import org.junit.Assert.*

class Test19_313 {
    private val production = Production19_313("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}