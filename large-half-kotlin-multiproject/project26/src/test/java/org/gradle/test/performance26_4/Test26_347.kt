package org.gradle.test.performance26_4

import org.junit.Assert.*

class Test26_347 {
    private val production = Production26_347("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}