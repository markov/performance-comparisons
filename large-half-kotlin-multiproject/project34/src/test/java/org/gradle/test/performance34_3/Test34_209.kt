package org.gradle.test.performance34_3

import org.junit.Assert.*

class Test34_209 {
    private val production = Production34_209("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}