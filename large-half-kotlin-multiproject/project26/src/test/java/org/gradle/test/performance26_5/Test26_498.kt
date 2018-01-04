package org.gradle.test.performance26_5

import org.junit.Assert.*

class Test26_498 {
    private val production = Production26_498("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}