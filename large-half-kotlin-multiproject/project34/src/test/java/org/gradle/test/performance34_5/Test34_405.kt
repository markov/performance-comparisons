package org.gradle.test.performance34_5

import org.junit.Assert.*

class Test34_405 {
    private val production = Production34_405("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}